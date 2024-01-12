package indi.mofan.step;

import lombok.Getter;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author mofan
 * @date 2024/1/12 17:58
 * @link <a href="http://www.svlada.com/step-builder-pattern/">Step builder pattern</a>
 */
@Getter
public class Email {
    private final EmailAddress from;
    private final List<EmailAddress> to;
    private final List<EmailAddress> cc;
    private final List<EmailAddress> bcc;
    private final String subject;
    private final String content;

    public static FromStep builder() {
        return new Builder();
    }

    public interface FromStep {
        ToStep from(EmailAddress from);
    }

    public interface ToStep {
        SubjectStep to(List<EmailAddress> to);
    }

    public interface SubjectStep {
        ContentStep subject(String subject);
    }

    public interface ContentStep {
        Builder content(String content);
    }

    public interface Build {
        /**
         * 构造 Email 对象
         */
        Email build();

        /**
         * cc 是可选的
         */
        Build cc(List<EmailAddress> cc);

        /**
         * bcc 也是可选的
         */
        Build bcc(List<EmailAddress> bcc);
    }

    private Email(Builder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.cc = builder.cc;
        this.bcc = builder.bcc;
        this.subject = builder.subject;
        this.content = builder.content;
    }

    public static class Builder implements FromStep, ToStep, SubjectStep, ContentStep, Build {
        private EmailAddress from;
        private List<EmailAddress> to;
        private List<EmailAddress> cc;
        private List<EmailAddress> bcc;
        private String subject;
        private String content;

        private static void requireNotEmptyList(List<?> list) {
            if (CollectionUtils.isEmpty(list)) {
                throw new RuntimeException();
            }
        }

        @Override
        public Email build() {
            return new Email(this);
        }

        @Override
        public ToStep from(EmailAddress from) {
            Objects.requireNonNull(from);
            this.from = from;
            return this;
        }

        @Override
        public SubjectStep to(List<EmailAddress> to) {
            requireNotEmptyList(to);
            this.to = new ArrayList<>(to);
            return this;
        }

        @Override
        public ContentStep subject(String subject) {
            Objects.requireNonNull(subject);
            this.subject = subject;
            return this;
        }

        @Override
        public Builder content(String content) {
            Objects.requireNonNull(content);
            this.content = content;
            return this;
        }

        @Override
        public Build cc(List<EmailAddress> cc) {
            requireNotEmptyList(cc);
            this.cc = new ArrayList<>(cc);
            return this;
        }

        @Override
        public Build bcc(List<EmailAddress> bcc) {
            requireNotEmptyList(bcc);
            this.bcc = new ArrayList<>(bcc);
            return this;
        }
    }
}

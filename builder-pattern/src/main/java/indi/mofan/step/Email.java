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

    public sealed interface FromStep permits Builder {
        ToStep from(EmailAddress from);
    }

    public sealed interface ToStep permits Builder {
        SubjectStep to(List<EmailAddress> to);
    }

    public sealed interface SubjectStep permits Builder {
        ContentStep subject(String subject);
    }

    public sealed interface ContentStep permits Builder {
        Build content(String content);
    }

    public sealed interface Build permits Builder {
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

    public final static class Builder implements FromStep, ToStep, SubjectStep, ContentStep, Build {
        private EmailAddress from;
        private List<EmailAddress> to;
        private String subject;
        private String content;
        private final List<EmailAddress> cc = new ArrayList<>();
        private final List<EmailAddress> bcc = new ArrayList<>();

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
            if (CollectionUtils.isEmpty(to)) {
                throw new RuntimeException();
            }
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
        public Build content(String content) {
            Objects.requireNonNull(content);
            this.content = content;
            return this;
        }

        @Override
        public Build cc(List<EmailAddress> cc) {
            this.cc.addAll(CollectionUtils.emptyIfNull(cc));
            return this;
        }

        @Override
        public Build bcc(List<EmailAddress> bcc) {
            this.bcc.addAll(CollectionUtils.emptyIfNull(bcc));
            return this;
        }
    }
}

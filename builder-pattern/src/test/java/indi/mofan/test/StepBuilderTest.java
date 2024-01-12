package indi.mofan.test;

import indi.mofan.step.Email;
import indi.mofan.step.EmailAddress;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author mofan
 * @date 2024/1/12 20:32
 */
public class StepBuilderTest implements WithAssertions {
    @Test
    public void testStepBuild() {
        Email email = Email.builder()
                .from(EmailAddress.from("A"))
                .to(List.of(EmailAddress.from("B"), EmailAddress.from("C")))
                .subject("subject")
                .content("content")
                .bcc(List.of(EmailAddress.from("D")))
                .cc(List.of(EmailAddress.from("E")))
                .build();

        assertThat(email.getFrom().getAddress()).isEqualTo("A");
        assertThat(email.getTo())
                .map(EmailAddress::getAddress)
                .containsExactly("B", "C");
        assertThat(email.getSubject()).isEqualTo("subject");
        assertThat(email.getContent()).isEqualTo("content");
        assertThat(email.getBcc()).map(EmailAddress::getAddress)
                .singleElement()
                .isEqualTo("D");
        assertThat(email.getCc()).map(EmailAddress::getAddress)
                .singleElement()
                .isEqualTo("E");
    }
}

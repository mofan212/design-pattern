package indi.mofan.step;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author mofan
 * @date 2024/1/12 17:59
 */
@Getter
@RequiredArgsConstructor(staticName = "from")
public class EmailAddress {
    private final String address;
}

package indi.mofan.eventbus.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author mofan
 * @date 2021/8/10 15:59
 */
@Getter
@Setter
@AllArgsConstructor
public class FailureEvent {
    private String failureMsg;
}

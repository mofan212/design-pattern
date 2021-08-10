package indi.mofan.eventbus.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author cheny
 * @date 2021/8/10 15:29
 */
@Getter
@Setter
@AllArgsConstructor
public class SuccessfulEvent {
    private String msg;
}

package homniserv.moueza.state_machine_aef_fsm_fsa;

import org.springframework.statemachine.annotation.WithStateMachine;
/**https://projects.spring.io/spring-statemachine/*/
@WithStateMachine
static class MyBean {

    @OnTransition(target = "STATE1")
    void toState1() {
    }

    @OnTransition(target = "STATE2")
    void toState2() {
    }
}
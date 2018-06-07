package referenceConfig2;

import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;

/** https://projects.spring.io/spring-statemachine/ */
@WithStateMachine
public class MyBean {

	@OnTransition(target = "STATE1")
	void toState1() {
	}

	@OnTransition(target = "STATE2")
	void toState2() {
	}
}
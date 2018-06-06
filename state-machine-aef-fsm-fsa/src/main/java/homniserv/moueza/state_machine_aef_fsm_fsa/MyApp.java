package homniserv.moueza.state_machine_aef_fsm_fsa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;

public class MyApp {

	@Autowired
	StateMachine<States, Events> stateMachine;

	void doSignals() {
		stateMachine.start();
		stateMachine.sendEvent(Events.EVENT1);
		stateMachine.sendEvent(Events.EVENT2);
	}
}
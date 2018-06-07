package homniserv.moueza.state_machine_aef_fsm_fsa;

import java.util.EnumSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.config.StateMachineBuilder.Builder;

public class MyApp {
	StateMachine<States, Events> stateMachine;

	public StateMachine<States, Events> buildMachine() throws Exception {
		Builder<States, Events> builder = StateMachineBuilder.builder();

		builder.configureStates().withStates().initial(States.STATE1).states(EnumSet.allOf(States.class));

		builder.configureTransitions().withExternal().source(States.STATE1).target(States.STATE2).event(Events.EVENT1)
				.and().withExternal().source(States.STATE2).target(States.STATE1).event(Events.EVENT2);

		return builder.build();
	}

	// @Autowired
	// StateMachine<States, Events> stateMachine;

	/** https://projects.spring.io/spring-statemachine/ */
	void doSignals() {
		stateMachine.start();
		//stateMachine.sendEvent(Events.EVENT1);
		// stateMachine.sendEvent(Events.EVENT2);
	}

	public static void main(String[] args) throws Exception {
		/** https://projects.spring.io/spring-statemachine/ */

		MyApp myapp = new MyApp();
		myapp.stateMachine = myapp.buildMachine();

		myapp.doSignals();
		System.out.println("end");
	}
}
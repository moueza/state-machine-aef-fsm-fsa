package referenceConfig2;

import java.util.EnumSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

/**
 * https://docs.spring.io/spring-statemachine/docs/current/reference/htmlsingle/#state-annotations
 */
public class Config2 {
	@Autowired
	StateRepository<JpaRepositoryState> stateRepository;

	@Autowired
	TransitionRepository<JpaRepositoryTransition> transitionRepository;

	void addConfig() {
		JpaRepositoryState stateS1 = new JpaRepositoryState("S1", true);
		JpaRepositoryState stateS2 = new JpaRepositoryState("S2");
		JpaRepositoryState stateS3 = new JpaRepositoryState("S3");

		stateRepository.save(stateS1);
		stateRepository.save(stateS2);
		stateRepository.save(stateS3);

		JpaRepositoryTransition transitionS1ToS2 = new JpaRepositoryTransition(stateS1, stateS2, "E1");
		JpaRepositoryTransition transitionS2ToS3 = new JpaRepositoryTransition(stateS2, stateS3, "E2");

		transitionRepository.save(transitionS1ToS2);
		transitionRepository.save(transitionS2ToS3);
	}
}

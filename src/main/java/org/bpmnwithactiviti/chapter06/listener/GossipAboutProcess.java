package org.bpmnwithactiviti.chapter06.listener;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

public class GossipAboutProcess implements ExecutionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		
		System.out.println("Did you know the following process event occured = " + execution.getEventName());
		EventUtil.addEvent(execution, "process");
	}

}

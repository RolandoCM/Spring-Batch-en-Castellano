package com.maldiny.spring.batch.chunk.context.params;

import java.util.Calendar;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class StepBTasklet implements Tasklet {

	String taskletName;
	
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {

		System.out.println("Executing step with name " + taskletName);
		
		return RepeatStatus.FINISHED;
	}

	public String getTaskletName() {
		return taskletName;
	}

	public void setTaskletName(String taskletName) {
		this.taskletName = taskletName;
	}

}

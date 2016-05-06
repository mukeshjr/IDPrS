package com.prediction.HMM.HMMEval;

import com.prediction.HMM.HMMObservation.Observation;
import com.prediction.HMM.HMMs.HMM;

public abstract class Evaluation {
	HMM hmm;
	Observation observation;
	int stateLength;
	int obsLength;
	double[][] alpha;
	
	public abstract double alpha(int obsIndex, int stateIndex);
	
	public abstract double forward();

}

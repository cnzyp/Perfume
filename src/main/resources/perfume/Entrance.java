package main.resources.perfume;

import main.resources.perfume.codesmell.*;
import main.resources.perfume.test.metric.*;
import test.metric.CYCLOMethodTest;

public class Entrance {
	public static void main(String[] args) {
//		new CYCLOMethodTest("D:\\Qualitas Corpus\\001-apache-ant-1.9.6-src");
//		new LOC_CLASSTest("D:\\Qualitas Corpus\\112-xmojosrc_5.0.0");
		AbstractCodeSmell acs = new LazyClass() ;
		acs.makeTrainingSet("D:\\Qualitas Corpus\\", "001-apache-ant-1.9.6-src");
//		TrainingSetUtil util = new TrainingSetUtil();
//		util.makeTrainningSet("D:\\Qualitas Corpus\\", new LazyClass());
	}
}
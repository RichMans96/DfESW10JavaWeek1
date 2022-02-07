package com.qa.day1.resultsexercise;

public class Results {
//	A person takes 3 exams in college, Physics, Chemistry, 
//	and Biology, each exam has a maximum of 150 marks.
//	When all the exam marks have been added together, 
//	we can find the overall percentage that the person 
//	has got by multiplying their score by 100 and then 
//	dividing by 450.
//
//	Create the results class, this class has 5 variables, 
//	Physics, Chemistry, and Biology, total and percentage. 
//	This class should also have 2 methods:
//
//	Method 1 - displays the results that the person 
//	got for each exam and then the total mark. 
//	Try to make the output neat and bespoke for each exam.
//	Method 2 - which finds and displays the percentage 
//	that the person received for the exams overall.
	int physics, chemistry, biology, total;
	double percentage;
	
	public Results(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
	}

	public void finalResults() {
		this.total = this.physics + this.chemistry + this.biology;
		System.out.println("Your mark for physics was: " + this.physics);
		System.out.println("Your mark for chemistry was: " + this.chemistry);
		System.out.println("Your mark for biology was: " + this.biology);
		System.out.println("Your total mark is " + this.total);
	}
	
	public void percentage() {
		this.percentage = this.total * 100 / 450;
		System.out.println("Your percentage is: " + this.percentage);
	}
	
}

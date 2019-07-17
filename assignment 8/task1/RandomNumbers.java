package task1;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbers {
	double first;
	double second;
	int correctNo, wrongNo, size;
	List<Double> results = new ArrayList<Double>();
	List<Boolean> correct = new ArrayList<Boolean>();
	
	RandomNumbers(){
		correctNo = 0;
		wrongNo = 0;
		first = (int) (Math.random() * 100);
		second = (int) (Math.random() * 100);
		results.add(first + second);
		results.add(first - second);
		results.add(first * second);
		results.add(first / second);
		size = results.size();
	}
	
	public void check(List<Double> answers) {
		for(int i = 0; i < size; i++) {
			double a = answers.get(i);
			double b = results.get(i);
			if(a == b) {

				correct.add(true);
			}
			
			else {
				correct.add(false);
			}
		}
		
		for(int i = 0; i < correct.size(); i++) {
			if(correct.get(i) == true) {
				correctNo++;
			}
			else {
				wrongNo++;
			}
		}
		System.out.println(answers);
		System.out.println(correct);
		System.out.println(results);
		System.out.println(correctNo);
		System.out.println(wrongNo);
	}
	
	public int getFirst() {
		return (int) first;	
	}
	
	public int getSecond() {
		return (int) second;	
	}
	
	public int getCorrect() {
		return (int) correctNo;	
	}
	
	public int getWrong() {
		return (int) wrongNo;	
	}
	
	public void reset() {
		correct.clear();
		System.out.print(correct);
		wrongNo = 0;
		correctNo = 0;
	}
}

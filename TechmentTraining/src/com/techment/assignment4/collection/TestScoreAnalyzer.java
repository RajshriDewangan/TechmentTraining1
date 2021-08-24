package com.techment.assignment4.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

 class ScoreAnalyzer
{
	private LinkedList<Integer> runsData = new LinkedList<Integer>();
	
	public void addRunsToList(int runsData) {
		this.runsData.add(runsData);
	}
	public void calcRunRate() {
		int sum = 0;
		for(int i =0 ;i< runsData.size();i++)
		{
			sum = sum + runsData.get(i);
		}
		
		System.out.println("RunRate:"+(sum/50.0));
			
	}
	public void displayRuns() {
		
		System.out.println("Runs scored:");
		for(Integer i : runsData)
		{
			System.out.println(i);
		}
	}
	
	public void LowestRunScored(){
		System.out.println("lowest run:"+Collections.min(runsData));
	}
}

public class TestScoreAnalyzer {

	public static void main(String[] args) {

		ScoreAnalyzer scoreanalyzer = new ScoreAnalyzer();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter total players:");
		int player = scanner.nextInt();
		
		for(int i=0;i<player;i++)
		{
			System.out.println("Enter runs of "+(i+1)+" : ");
			scoreanalyzer.addRunsToList(scanner.nextInt());
		}
		scoreanalyzer.displayRuns();
		scoreanalyzer.calcRunRate();
		scoreanalyzer.LowestRunScored();
		
		System.out.println("count of player who batted:"+player);
	}

}

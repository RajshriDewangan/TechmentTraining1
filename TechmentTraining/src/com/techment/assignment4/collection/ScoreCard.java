package com.techment.assignment4.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

 class Score
{
		 HashMap<String, Integer> run = new HashMap<String, Integer>();

		public void addRuns(String name,int run) {
			this.run.put(name,run);
		}
		
		public void displayRuns() {
			System.out.println("Runs scored:");
			for(Entry<String, Integer> runs : run.entrySet())
			{
				System.out.println(runs);
			}

		}
		public void displayPlayers() {
			System.out.println("Players who batted:");
			for(Entry<String,Integer> runs : run.entrySet())
			{
				System.out.println(runs.getKey());
			}

		}
		public void totalScore() {
			int total =0;
			for(Entry<String,Integer> runs : run.entrySet())
			{
				total += runs.getValue();
			}
			System.out.println("Total Score:"+total);
		}
//		public void highRun() {
//			System.out.println("Name of Highest scorer:"+Collections.max(run));
//		}
}

public class ScoreCard {

	public static void main(String[] args) {

		 Score score = new Score();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter total players:");
		int player = scanner.nextInt();
		
		for(int i=0;i<player;i++)
		{
			System.out.println("Enter runs of "+(i+1)+" : ");
			score.addRuns(scanner.next(),scanner.nextInt());
		}
		score.displayPlayers();
		score.displayRuns();
		score.totalScore();
		
	}

}

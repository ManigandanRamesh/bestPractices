package com.chainsys.bestPractices.abstractDemo;

public class ScoreBoard
{
	public int TargetScore =215;
	private ScoreBoard() {
		System.out.println("object created for ScoreBoard");
	}
	// Create object() is a factory method
  public static ScoreBoard createObject() {
	  return new ScoreBoard();
  }
	
}

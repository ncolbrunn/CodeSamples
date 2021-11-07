using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Script2 : MonoBehaviour {

	public Text currentText;
	public double current;
	public Text totalText;
	public double total;
	public Text dailyHighText;
	public double dailyHigh;

	public void Start() 
	{
		current = 0;
		total = 0;
		dailyHigh = 0;
	}
	public void add1 (){
		current++;
		total++;

	}
	public void minus1 (){
		current--;

	}

	public void Update ()
	{
		totalText.text = "Total guests today: " + total;
		dailyHighText.text = "Daily high: " + dailyHigh;
		currentText.text = "Current guests: " + current;
		if (dailyHigh < current) {
			dailyHigh = current;
		}
	}
}

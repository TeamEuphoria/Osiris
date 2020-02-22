package de.Hero.settings;

import java.awt.*;
import java.util.ArrayList;

import me.finz0.osiris.module.Module;

/**
 *  Made by HeroCode
 *  it's free to use
 *  but you have to credit me
 *
 *  @author HeroCode
 */
public class Setting {
	
	private String name;
	private Module parent;
	private String mode;
	
	private String sval;
	private ArrayList<String> options;
	
	private boolean bval;
	
	private double dval;
	private double min;
	private double max;
	private boolean onlyint = false;


	private Color color;

	public Setting(String name, Module parent, String sval, ArrayList<String> options){
		this.name = name;
		this.parent = parent;
		this.sval = sval;
		this.options = options;
		this.mode = "Combo";
	}
	
	public Setting(String name, Module parent, boolean bval){
		this.name = name;
		this.parent = parent;
		this.bval = bval;
		this.mode = "Check";
	}
	
	public Setting(String name, Module parent, double dval, double min, double max, boolean onlyint){
		this.name = name;
		this.parent = parent;
		this.dval = dval;
		this.min = min;
		this.max = max;
		this.onlyint = onlyint;
		this.mode = "Slider";
	}

	public Setting(String name, Module parent, Color color){
		this.name = name;
		this.parent = parent;
		this.color = color;
		this.mode = "ColorPicker";
	}
	
	public String getName(){
		return name;
	}
	
	public Module getParentMod(){
		return parent;
	}
	
	public String getValString(){
		return this.sval;
	}
	
	public void setValString(String in){
		this.sval = in;
	}
	
	public ArrayList<String> getOptions(){
		return this.options;
	}
	
	public boolean getValBoolean(){
		return this.bval;
	}
	
	public void setValBoolean(boolean in){
		this.bval = in;
	}
	
	public double getValDouble(){
		if(this.onlyint){
			this.dval = (int)dval;
		}
		return this.dval;
	}

	public int getValInt(){
		return (int)getValDouble();
	}

	public void setValDouble(double in){
		this.dval = in;
	}
	
	public double getMin(){
		return this.min;
	}
	
	public double getMax(){
		return this.max;
	}
	
	public boolean isCombo(){
		return this.mode.equalsIgnoreCase("Combo");
	}
	
	public boolean isCheck(){
		return this.mode.equalsIgnoreCase("Check");
	}
	
	public boolean isSlider(){
		return this.mode.equalsIgnoreCase("Slider");
	}

	public boolean isColorPicker(){
		return mode.equalsIgnoreCase("ColorPicker");
	}
	
	public boolean onlyInt(){
		return this.onlyint;
	}

	public Color getValColor(){
		return color;
	}

	public void setValColor(Color newColor){
		color = newColor;
	}

	public int getColorRed(){
		return color.getRed();
	}
	public int getColorGreen(){
		return color.getGreen();
	}
	public int getColorBlue(){
		return color.getBlue();
	}

	public int getColorRgb(){
		return color.getRGB();
	}
}

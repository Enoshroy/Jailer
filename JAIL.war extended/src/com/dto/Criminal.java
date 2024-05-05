package com.dto;

import java.util.List;

public class Criminal {

	private String Name;
    private String crime;
    private int dateofrealse;
    private int punishmentperiod;
    private String Khadhino;
    public Criminal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Criminal(String name, String crime, int dateofrealse, int punishmentperiod, String khadhino) {
		super();
		Name = name;
		this.crime = crime;
		this.dateofrealse = dateofrealse;
		this.punishmentperiod = punishmentperiod;
		Khadhino = khadhino;
	}
	public Criminal(String name,int dateofrealse2, int punishmentperiod2) {
		super();
		Name = name;
		this.dateofrealse = dateofrealse;
		this.punishmentperiod = punishmentperiod;
		
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCrime() {
		return crime;
	}
	public void setCrime(String crime) {
		this.crime = crime;
	}
	public int getDateofrealse() {
		return dateofrealse;
	}
	public void setDateofrealse(int dateofrealse) {
		this.dateofrealse = dateofrealse;
	}
	public int getPunishmentperiod() {
		return punishmentperiod;
	}
	public void setPunishmentperiod(int punishmentperiod) {
		this.punishmentperiod = punishmentperiod;
	}
	public String getKhadhino() {
		return Khadhino;
	}
	public void setKhadhino(String khadhino) {
		Khadhino = khadhino;
	}
	@Override
	public String toString() {
		return "Criminal [Name=" + Name + ", crime=" + crime + ", dateofrealse=" + dateofrealse + ", punishmentperiod="
				+ punishmentperiod + ", Khadhino=" + Khadhino + "]";
	}
	
	
	
	
}

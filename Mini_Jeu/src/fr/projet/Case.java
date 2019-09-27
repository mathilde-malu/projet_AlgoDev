package fr.projet;

public class Case {
	 private char val;
	 private boolean modifiable;

	 public Case() {
		  setVal('0');
		  setModifiable(true); }

	public Case(char val, boolean modifiable) {
		  this.setVal(val);
		  this.setModifiable(modifiable); }

	public char getVal() {
		return val;
	}

	public void setVal(char val) {
		this.val = val;
	}

	public boolean isModifiable() {
		return modifiable;
	}

	public void setModifiable(boolean modifiable) {
		this.modifiable = modifiable;
	}
		}

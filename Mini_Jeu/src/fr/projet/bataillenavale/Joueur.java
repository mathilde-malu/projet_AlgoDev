package fr.projet.bataillenavale;

public class Joueur {
	private String nom;
	private String prenom;
	private String nickname;
	
	public Joueur() {
	nom = "nom";
	prenom = "prenom";
	nickname = "pseudo";
	
	}
	
	public Joueur (String nickname) {
		this.nickname = nickname;
	}
	
	public Joueur (String nom, String prenom, String nickname) {
		this.nom = nom;
		this.prenom = prenom;
		this.nickname = nickname;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}

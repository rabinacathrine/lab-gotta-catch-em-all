package model;

//import java.time.LocalDate;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class

class Pokemon{
	String pokemonName;
	int pokemonNumber;
	public String getName() {
		
		return pokemonName;
	}

	public void setName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	
	public int getNumber() {
		return pokemonNumber;
	}
	public void setNumber(int pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}
public Pokemon(String pokemonName,int pokemonNumber) {
	this.pokemonName=pokemonName;
	this.pokemonNumber=pokemonNumber;
}
	}
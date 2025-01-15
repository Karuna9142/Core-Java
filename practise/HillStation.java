package com.practise;

          class HillStation {
	
		// Superclass HillStations

		    public void location() {
		        System.out.println("Location: Unknown");
		    }

		    public void famousFor() {
		        System.out.println("Famous for: Unknown");
		    }
		}

		// Subclass Manali
		 class Manali extends HillStation {
		    @Override
		    public void location() {
		        System.out.println("Location: Himachal Pradesh, India");
		    }

		    @Override
		    public void famousFor() {
		        System.out.println("Famous for: Snowfall and Adventure Sports");
		    }
		}

		// Subclass Mussoorie
		 class Mussoorie extends HillStation {
		    @Override
		    public void location() {
		        System.out.println("Location: Uttarakhand, India");
		    }
		        @Override
			    public void famousFor()
		        {
			        System.out.println("Famous for: Natural Beauty and Trekking");
			    }
			}

			// Subclass Gulmarg
			 class Gulmarg extends HillStation {
			    @Override
			    public void location() {
			        System.out.println("Location: Jammu and Kashmir, India");
			    }

			    @Override
			    public void famousFor() {
			        System.out.println("Famous for: Skiing and Golfing");
			    }
			}

			// Main class to test the program
			class Main {
			    public static void main(String[] args) {
			        // i. Call the location() and famousFor() method by the Parent class'
			        HillStation hillStations = new HillStation();
			        hillStations.location();
			        hillStations.famousFor();

			        System.out.println();

			        // ii. Call the location() and famousFor() method by the all subclass'
			        HillStation manali = new Manali();
			        manali.location();
			        manali.famousFor();

			        System.out.println();

			        HillStation mussoorie = new Mussoorie();
			        mussoorie.location();
			        mussoorie.famousFor();

			        System.out.println();

			        HillStation gulmarg = new Gulmarg();
			        gulmarg.location();
			        gulmarg.famousFor();
			    }
			}



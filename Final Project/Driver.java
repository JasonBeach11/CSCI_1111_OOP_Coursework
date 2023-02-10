/**
 * Author: Jason Beach
 * Date: 02/09/2023
 * 
 * CSCI 1111: Final Project - Utah Native Evergreen Tree Identification. 
 * This program uses defining physical characteristics to help a user identify Utah native evergreen trees.
 * The program is limited to trees native or naturalized to Utah and does not included imported/cultivated trees.
 * The program also does not include broad-leaf trees at this time.
 * 
 * */

import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		// CREATE TREE OBJECTS
		
		Tree singleLeafPinyonPine = new Tree("Singleleaf Pinyon Pine", "Pinus monophylla");
		singleLeafPinyonPine.setTrivia("The Singleleaf Pinyon Pine has the largest edible seeds of any native pine in Utah.");
		
		Tree lodgepolePine = new Tree("Lodgepole Pine", "Pinus contora");
		lodgepolePine.setTrivia("The Lodgepole Pine's cones open after a fires, reseeding the area, resulting in pure stands of even-aged trees.");
		
		Tree twoNeedlePinyonPine = new Tree("Two-Needle Pinyon Pine", "Pinus edulis");
		twoNeedlePinyonPine.setTrivia("The Two-Needle Pinyon Pine is the official state tree of New Mexico.");
		
		Tree ponderosaPine = new Tree("Ponderosa Pine", "Pinus ponderosa");
		ponderosaPine.setTrivia("Ponderosa Pine bark smells like vanilla or butterscotch.");
		
		Tree limberPine = new Tree("Limber Pine", "Pinus flexilis");
		limberPine.setTrivia("The Limber Pine gets its name from its especially pliant branches.");
		
		Tree bristleconePine = new Tree("Bristlecone Pine", "Pinus longaeva");
		bristleconePine.setTrivia("The Bristlecone Pine is the longest-lived species in the world. A few are known to have lived for 5000+ years!");
		
		Tree subAlpineFir = new Tree ("Alpine Fir", "Abies bifolia");
		subAlpineFir.setTrivia("Subalpine Fir is very fragrant. The pitch gives it the classic Christmas Tree smell.");
		
		Tree whiteFir = new Tree ("White Fir", "Abies concolor");
		whiteFir.setTrivia("The White Fir got its name from the silvery-blue color of its needles that almost look white when the light strikes them.");
		
		Tree englemannSpruce = new Tree ("Englemann Spruce", "Picea engelmannii");
		englemannSpruce.setTrivia("The Englemann Pruce has great pulp making and paper making properties.");
		
		Tree blueSpruce = new Tree ("Blue Spruce", "Picea pungens");
		blueSpruce.setTrivia("The Blue Spruce is often used as Christmas Trees due to its pleasing, symetrical shape.");
		
		Tree commonJuniper = new Tree ("Common Juniper","Juniperus communis");
		commonJuniper.setTrivia("Juniper berries are edible and have been used to flavor Gin.");
		
		Tree rockyMountainJuniper = new Tree ("Rocky Mountain Juniper","Juniperus scopulorum");
		rockyMountainJuniper.setTrivia("The leaves of the Rocky Mountain Juniper can be steeped to make a soothing tea for sore throats.");
		
		Tree utahJuniper = new Tree ("Utah Juniper","Juniperus osteosperma");
		utahJuniper.setTrivia("Utah Juniper berries take 2 years to mature. When mature they will turn red or reddish-brown.");
		
		
		// Program Menu
		System.out.println("\nUTAH NATIVE EVERGREEN TREE IDENTIFICATION\n");
		
		System.out.println("What type of leaf does the tree have?");
		System.out.println("'1' for 'Needle-Like'");
		System.out.println("'2' for 'Scale-Like or Awl-Shaped'");
		
		int userLeafType = input.nextInt();
		
		
		// Check for valid input by user and prompt for new input if needed
		while (userLeafType != 1 && userLeafType != 2) {
			System.out.println("What type of leaf does the tree have?");
			System.out.println("'1' for 'Needle-Like'");
			System.out.println("'2' for 'Scale-Like or Awl-Shaped'");
			
			userLeafType = input.nextInt();
		}
		
		
		// Begin Needle-like tree Identification (includes: Pine, Fir, Spruce)
		if (userLeafType == 1) {
			
			System.out.print("How many needles in each needle bundle? (1, 2, 3, 5) ");
			
			int bundles = input.nextInt();
			
			
			// If needles come in bundles of 1
			if (bundles == 1) {
				System.out.print("\nAre needles round, somewhat flat, or square in cross section?: \n'1' for round \n'2' for flat \n'3' for square");
				int needleRoundness = input.nextInt();
				
				// If needles are round Singleleaf Pinyon Pine
				if (needleRoundness == 1) {
					// Singleleaf Pinyon Pine
					System.out.println("\n" + singleLeafPinyonPine.toString());
				}
				
				// If needles are flat - FIR
				else if (needleRoundness == 2) {
					
					System.out.print("\nIs the longest needle longer than 4 cm? \n'1' for Yes \n'2' for No");
					int needleLength = input.nextInt();
					
					// White Fir
					if (needleLength == 1 ) {
						System.out.print("\n" + whiteFir.toString());
					}
					
					// Subalpine Fir
					else if (needleLength == 2) {
						System.out.print("\n" + subAlpineFir.toString());
					}
					
				}
				
				// If needles are square in cross section - SPRUCE
				else if (needleRoundness == 3) {
					System.out.print("\nEnter '1' if short, soft hairs are present on branchlet and needles stink when crushed.");
					System.out.print("\nEnter '2' if hairs are not present on branchlet and needles smell resinous when crushed.");
					
					int needleStink = input.nextInt();
					
					// Englemann Spruce
					if (needleStink == 1) {
						System.out.println("\n"+englemannSpruce.toString());
					}
					
					// Blue Spruce
					else if(needleStink == 2) {
						System.out.println("\n"+blueSpruce.toString());
					}
				}
				
			}
			
	
			// If needles come in bundles of 2
			else if(bundles == 2) {
				System.out.print("\nAre the needles conspicuously twisted? \n'1' for Yes \n'2' for No ");
				int twisted = input.nextInt();
				
				if (twisted == 1) {
					// Lodge Pole Pine
					System.out.println("\n" + lodgepolePine.toString());
				}
				
				else {
					// Two Needle Pinyon Pine
					System.out.println("\n" + twoNeedlePinyonPine.toString());
				}
			}
			
			
			// If needles come in bundles of 3
			else if (bundles == 3) {
				// Ponderosa Pine
				System.out.println("\n" + ponderosaPine.toString());
			}
			
			
			// If needles come in bundles of 5
			else if (bundles == 5) {
				System.out.println("\nAre the needles longer than 4cm? \n'1' for Yes \n'2' for No ");
				int needleLength = input.nextInt();
				
				if (needleLength == 1) {
					// Limber Pine
					System.out.println("\n" + limberPine.toString());
				}
				
				else if(needleLength == 2) {
					// Great Basin Bristlecone Pine
					System.out.println("\n" + bristleconePine.toString());	
				}
			}
			
			// If user selects bundles of 6 or more
			else {
				System.out.println("\nError. Needle clusters should contain 1, 2, 3, or 5 needles. Check again.");
			}
			
		} // End Needle-like tree identification
		
		
		// Begin Scale and Awl leaf type identification (includes: Juniper trees)
		else if (userLeafType == 2) {
			System.out.print("\nAre the needles Scale-like or Awl-shaped? \n'1' for Scale-like \n'2' for Awl-shaped ");
			
			int scaleOrAwl = input.nextInt();
			
			// if scale-like: Rocky Mountain Juniper OR Utah Juniper
			if (scaleOrAwl == 1) {
				System.out.print("\nAre the scale leaves sometimes serrated with a few fine teeth? \n'1' for YES \n'2' for NO ");
				
				int serration = input.nextInt();
				
				// If serrated: Utah Juniper
				if (serration == 1) {
					System.out.println("\n" + utahJuniper.toString());
				}
				
				// If not serrated: Rocky Mountain Juniper
				else if (serration == 2) {
					System.out.println("\n" + rockyMountainJuniper.toString());
				}
				
			}
			
			
			// If Awl-shaped tree is Common Juniper
			else if (scaleOrAwl == 2) {
				System.out.println("\n" + commonJuniper.toString());
				
			}
			
		} // End Scale and Awl shaped leaf identification
		
		
	} // End Main
	
} // End Driver Class

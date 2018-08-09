package it.molveno.restaurant.recursion.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * This graph (Dutch: Graaf) represents in fact the city related map for a very small part of the Netherlands 
 */
public class Graph {

	// since Map is purely OCP related some small explaination
	/*
	 * a map is a "function" which related the first (String) to another "thing" (in this case the Set of neighbour(String)s
	 */
	private Map<String, Set<String>> mapCityToNeighbours = new HashMap<>();

	// fill the map/graaf with some data
	public Graph() {
		add("Almelo", "Hengelo");
		add("Hengelo", "Enschede");
		add("Hengelo", "Oldenzaal");
		add("Almelo", "Deventer");
		add("Deventer", "Utrecht");
		add("Utrecht", "Amsterdam");
		add("Utrecht", "Den Bosch");
		add("Eindhoven", "Den Bosch");
		add("Eindhoven", "Veghel");
	}

	public void printSolution(String start, String finish) {
		List<String> solution = this.dfs(start, finish, new HashSet<>());
		if (solution.isEmpty()) {
			System.out.println("there is no solution possible!");
		}
		else {
			System.out.print("From ");
			for (String city : solution) {
				System.out.print(city);
				System.out.print(", drive to ");
			}
			System.out.println("your home!");
		}
	}

	private List<String> dfs(String start, String finish, Set<String> visited) {
		List<String> result = new LinkedList<String>();

		// add start since we have to start at start :-)
		visited.add(start);
		result.add(start);

		// trivial case (done here)
		if (start.equals(finish)) {
			return result;
		}

		Set<String> neighbours = this.getNeighbours(start);
		for (String neighbour : neighbours) {

			// if I already visited this node than please skip it since else I
			// will enter an infinite loop (with in the end a
			// StackoverflowError)
			if (!visited.contains(neighbour)) {

				// try to find a solution from buur to finish recursively
				List<String> l = dfs(neighbour, finish, visited);

				
				if (!(l.isEmpty())) {
				// apparently we found a way from this neighbour to the finish,
				   
	            // so please add it to the resulting List
					result.addAll(l);

					return result;
				}
			}
		}

		return new LinkedList<>();
	}

	public void add(String city, String neighbour) {

		// perhaps init the list of this city
		if (this.getNeighbours(city).isEmpty()) {
			this.mapCityToNeighbours.put(city, new HashSet<>());
		}
		this.mapCityToNeighbours.get(city).add(neighbour);

		// reverse is also possible ... in the special city related case (no one
		// way traffic roads in the Netherlands :-) )
		if (this.getNeighbours(neighbour).isEmpty()) {
			this.mapCityToNeighbours.put(neighbour, new HashSet<>());
		}
		this.mapCityToNeighbours.get(neighbour).add(city);
	}

	public Set<String> getNeighbours(String city) {
		Set<String> result = this.mapCityToNeighbours.get(city);

		return result != null ? result : new HashSet<String>();
	}

}
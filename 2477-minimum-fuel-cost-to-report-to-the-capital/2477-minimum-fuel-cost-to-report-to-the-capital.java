class Solution {
    private long fuelCost;

    public long minimumFuelCost(int[][] roads, int seats) {
        if (roads == null || roads.length == 0) {
            return 0;
        }
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] road : roads) {
            graph.putIfAbsent(road[0], new ArrayList<>());
            graph.get(road[0]).add(road[1]);
            graph.putIfAbsent(road[1], new ArrayList<>());
            graph.get(road[1]).add(road[0]);
        }
        this.fuelCost = 0;
        for (int city : graph.get(0)) {
            numOfChildren(graph, city, 0, seats);
        }
        return this.fuelCost;
    }

    // DFS
    private long numOfChildren(Map<Integer, List<Integer>> graph, int city, int from, int seats) {
        if (graph.get(city).size() == 1) {
            this.fuelCost += 1;
            return 1;
        }
        int children = 1;
        for (int child : graph.get(city)) {
            if (child == from) {
                continue;
            }
            children += numOfChildren(graph, child, city, seats);
        }
        this.fuelCost += (children + seats - 1) / seats;
        return children;
    }
}
import java.util.*;

public class Election {
    private Map<String, Integer> candidatesMap = new HashMap<>();
    private int totalVotes;

    public void initializeCandidates(LinkedList<String> candidates, int p) {
        for (String candidate : candidates) {
            candidatesMap.put(candidate, 0);
        }
        totalVotes = p;
    }

    public void castVote(String candidate) {
        candidatesMap.put(candidate, candidatesMap.get(candidate) + 1);
    }

    public void castRandomVote() {
        List<String> candidateList = new ArrayList<>(candidatesMap.keySet());
        String randomCandidate = candidateList.get(new Random().nextInt(candidateList.size()));
        castVote(randomCandidate);
    }

    public void rigElection(String candidate) {
        int riggedVotes = (totalVotes / 2) + 1;
        int remainingVotes = totalVotes - riggedVotes;

        for (String c : candidatesMap.keySet()) {
            candidatesMap.put(c, c.equals(candidate) ? riggedVotes : 0);
        }

        for (String c : candidatesMap.keySet()) {
            if (!c.equals(candidate) && remainingVotes > 0) {
                candidatesMap.put(c, 1);
                remainingVotes--;
            }
        }
    }

    public List<String> getTopKCandidates(int k) {
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );
        heap.addAll(candidatesMap.entrySet());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k && !heap.isEmpty(); i++) {
            result.add(heap.poll().getKey());
        }
        return result;
    }

    public void auditElection() {
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(candidatesMap.entrySet());
        sorted.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        for (Map.Entry<String, Integer> entry : sorted) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
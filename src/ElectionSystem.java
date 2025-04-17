import java.util.*;

public class ElectionSystem {
    public static void main(String[] args) {
        Election election = new Election();
        Random rand = new Random();

        String[] allCandidates = {
                "Marcus Fenix", "Dominic Santiago", "Damon Baird",
                "Cole Train", "Anya Stroud", "Jayden Cruz", "Peter Hoang",
                "Chris Garcia", "Ethan Williams", "Rigo Berto", "Benito Cruz"
        };

        int numCandidates = 3 + rand.nextInt(5); // 3 to 7
        LinkedList<String> selectedCandidates = new LinkedList<>();
        boolean[] used = new boolean[allCandidates.length];

        while (selectedCandidates.size() < numCandidates) {
            int index = rand.nextInt(allCandidates.length);
            if (!used[index]) {
                selectedCandidates.add(allCandidates[index]);
                used[index] = true;
            }
        }

        int totalVotes = 5 + rand.nextInt(11);

        System.out.println("Candidates:");
        for (String c : selectedCandidates) {
            System.out.println("- " + c);
        }
        System.out.println("Total Votes: " + totalVotes);

        election.initializeCandidates(selectedCandidates, totalVotes);
        for (int i = 0; i < totalVotes; i++) {
            election.castRandomVote();
        }

        System.out.println("\nTop 3 candidates after voting:");
        List<String> topBefore = election.getTopKCandidates(3);
        for (String name : topBefore) {
            System.out.println(name);
        }

        String riggedWinner = selectedCandidates.get(0);
        System.out.println("\nRigging election for: " + riggedWinner);
        election.rigElection(riggedWinner);

        System.out.println("\nTop 3 candidates after rigging:");
        List<String> topAfter = election.getTopKCandidates(3);
        for (String name : topAfter) {
            System.out.println(name);
        }

        System.out.println("\nAudit:");
        election.auditElection();
    }
}
package me.algorithm.week9;

import java.util.*;

public class AccountsMerge {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, String> emailToName = new HashMap<>();
        Map<String, Integer> emailToId = new HashMap<>();
        int id = 0;

        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                if (!emailToName.containsKey(email)) {
                    emailToName.put(email, name);
                    emailToId.put(email, id++);
                }
            }
        }

        UnionFind uf = new UnionFind(id);

        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            int firstId = emailToId.get(firstEmail);

            for (int i = 2; i < account.size(); i++) {
                String email = account.get(i);
                id = emailToId.get(email);
                uf.union(firstId, id);
            }
        }

        Map<Integer, List<String>> idToEmails = new HashMap<>();
        for (String email : emailToName.keySet()) {
            id = uf.find(emailToId.get(email));
            List<String> account = idToEmails.getOrDefault(id, new ArrayList<>());
            account.add(email);
            idToEmails.put(id, account);
        }

        List<List<String>> mergedAccounts = new ArrayList<>();
        for (List<String> emails : idToEmails.values()) {
            Collections.sort(emails);
            String name = emailToName.get(emails.get(0));
            List<String> account = new ArrayList<>();
            account.add(name);
            account.addAll(emails);
            mergedAccounts.add(account);
        }

        return mergedAccounts;
    }
}

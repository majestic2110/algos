package com.mp.uf;

public class QuickUnion implements IUnionFind {

    int[] id;

    public QuickUnion(int n) {
        this.id = new int[n];
        for (int i = 0; i < n; i++) {
            this.id[i] = i;
        }
    }

    private int root(int p) {
        while (p != this.id[p]) {
            p = this.id[p];
        }
        return p;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        this.id[rootP] = rootQ;
    }
}

package com.mp.uf;

public class WeightedQuickUnionII implements IUnionFind {

    int[] id;
    int[] sz;

    public WeightedQuickUnionII(int n) {
        this.id = new int[n];
        this.sz = new int[n];
        for (int i = 0; i < n; i++) {
            this.id[i] = i;
        }
    }

    private int root(int p) {
        while (p != this.id[p]) {
            this.id[p] = this.id[this.id[p]];
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
        if (rootP == rootQ) {
            return;
        }
        if (this.sz[rootP] < this.sz[rootQ]) {
            this.id[rootP] = rootQ;
            this.sz[rootQ] += this.sz[rootP];
        } else {
            this.id[rootQ] = rootP;
            this.sz[rootP] += this.sz[rootQ];
        }
    }
}

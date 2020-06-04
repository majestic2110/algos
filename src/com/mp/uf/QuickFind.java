package com.mp.uf;

public class QuickFind implements IUnionFind {

    int[] id;

    public QuickFind(int n) {
        this.id = new int[n];
        for (int i = 0; i < n; i++) {
            this.id[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return this.id[p] == this.id[q];
    }

    @Override
    public void union(int p, int q) {
        int idP = this.id[p];
        int idQ = this.id[q];
        for (int i = 0; i < this.id.length; i++) {
            if (this.id[i] == idP) {
                this.id[i] = idQ;
            }
        }
    }
}

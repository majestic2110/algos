package com.mp.uf;

public interface IUnionFind {

    public boolean connected(int p, int q);

    public void union(int p, int q);
}

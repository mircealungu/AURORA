#include "AdjGraph.h"

  AdjGraph::AdjGraph(){};
  
  int AdjGraph::getLED(int x, int y){
  return adj[x][y];
  }

  int AdjGraph::getWeight(int led){
    return weight[led];
  }

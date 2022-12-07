package core.ai.behaviorTree.nodes.compositeNodes;

import core.ai.behaviorTree.nodes.BTNode;
import core.ai.behaviorTree.nodes.NodeState;

// define the root of a branch and the rules for how the branch is executed
public abstract class CompositeNode extends BTNode {

    public CompositeNode() {
        super("Composite Node");
    }

    public CompositeNode(String name) {
        super(name);
    }

    @Override
    public abstract NodeState execute();

}
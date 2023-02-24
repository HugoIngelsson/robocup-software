package java.core.ai.behaviorTree.robotTrees.fielder.defense.playDefense;

import java.core.ai.behaviorTree.nodes.NodeState;
import java.core.ai.behaviorTree.nodes.serviceNodes.ServiceNode;
import java.core.ai.behaviorTree.robotTrees.basicFunctions.ChaseBallNode;
import java.core.ai.behaviorTree.robotTrees.basicFunctions.ClosestToBallNode;
import java.core.ai.behaviorTree.robotTrees.fielder.defense.CutPassingLaneNode;
import static proto.triton.FilteredObject.Robot;

public class PlayDefenseService extends ServiceNode {

    private final ClosestToBallNode closestToBallNode;
    private final ChaseBallNode chaseBallNode;
    private final CutPassingLaneNode cutPassingLaneNode;

    public PlayDefenseService(Robot ally) {
        super("Play Defense Service: " + ally);
        this.closestToBallNode = new ClosestToBallNode(ally);
        this.chaseBallNode = new ChaseBallNode(ally);
        this.cutPassingLaneNode = new CutPassingLaneNode(ally);
    }

    /**
     * Chases ball if ally is closest to ball
     * Otherwise, cuts a passing lane
     */
    @Override
    public NodeState execute() {
        if (NodeState.isSuccess(this.closestToBallNode.execute())) {
            this.chaseBallNode.execute();
        }
        else {
            this.cutPassingLaneNode.execute();
        }
        return NodeState.SUCCESS;
    }

}

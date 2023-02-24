package java.core.ai.behaviorTree.robotTrees.goalkeeper.offense.offenseRoot;

import java.core.ai.GameInfo;
import java.core.ai.behaviorTree.nodes.NodeState;
import java.core.ai.behaviorTree.nodes.serviceNodes.ServiceNode;
import java.core.ai.behaviorTree.robotTrees.basicFunctions.CoordinatedPassNode;
import java.core.ai.behaviorTree.robotTrees.basicFunctions.RobotHasPossessionNode;
import java.core.ai.behaviorTree.robotTrees.goalkeeper.offense.GKPositionSelfNode;

/**
 * Defines behavior for goalkeeper when on offense
 * If goalkeeper doesn't have possession, moves to optimal position to be a passing option
 * If goalkeeper has possession, passes ball
 */
public class GKOffenseRootService extends ServiceNode {

    private final RobotHasPossessionNode havePossession;
    private final CoordinatedPassNode passBall;
    private final GKPositionSelfNode gkPositionSelfNode;

    public GKOffenseRootService() {
        super("GK Offense Root Service");
        this.havePossession = new RobotHasPossessionNode(GameInfo.getKeeper());
        this.passBall = new CoordinatedPassNode(GameInfo.getKeeper());
        this.gkPositionSelfNode = new GKPositionSelfNode(null);
    }

    public NodeState execute() {
        if(NodeState.isSuccess(this.havePossession.execute())) {
            this.passBall.execute();
        }
        else {
            this.gkPositionSelfNode.execute();
        }
        return NodeState.SUCCESS;
    }

}
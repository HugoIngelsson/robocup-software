package java.core.ai;

import java.core.fieldObjects.ball.Ball;
import static proto.triton.FilteredObject.*;
import java.core.fieldObjects.robot.Team;
import java.core.util.Vector2d;

import java.util.ArrayList;

import static java.core.util.ProtobufUtils.getPos;

/**
 * central hub to find all info related to game
 * vision module writes info here
 * BT uses info here to make decisions
 */
public class GameInfo {

    public static FilteredWrapperPacket wrapper;

    private static Team TEAM_COLOR;
    private static Team FOE_TEAM_COLOR;
    private static GameState currState;
    private static GameState prevState;
    private static Vector2d ballPlacementLocation;

    /**
     * Initialize game information
     */
    public void initialize(FilteredWrapperPacket wrapper, Team teamColor, Team foeTeamColor, GameState currState) {
        GameInfo.wrapper = wrapper;
        GameInfo.TEAM_COLOR = teamColor;
        GameInfo.FOE_TEAM_COLOR = foeTeamColor;
        GameInfo.currState = currState;
    }

    public static Team getTeamColor() {
        return TEAM_COLOR;
    }

    public static Team getFoeTeamColor() {
        return FOE_TEAM_COLOR;
    }

    public static ArrayList<Robot> getFielders() {
        ArrayList<Robot> allies = getAllies();
        allies.remove(0);
        return allies;
    }

    public static Robot getKeeper() {
        return getAllies().get(0);
    }

    public static ArrayList<Robot> getAllies() {
        ArrayList<Robot> allies = new ArrayList<Robot>();
        allies.addAll(wrapper.getAlliesMap());
        return allies;
    }

    public static ArrayList<Robot> getFoes() {
        ArrayList<Robot> foes = new ArrayList<Robot>();
        foes.addAll(wrapper.getFoesMap());
        return foes;
    }

    public static ArrayList<Robot> getFoeFielders() {
        ArrayList<Robot> foes = getFoes();
        foes.remove(0);
        return foes;
    }

    public static Robot getFoeKeeper() {
        return getFoes().get(0);
    }

    public static Boolean getPossessBall() {
        return wrapper.getBall().getCaptureState().type() == AllyCapture;
    }

    public static Robot getAllyClosestToBall() {
        ArrayList<Robot> allies = getAllies();
        Vector2d ballPos = getPos(wrapper.getBall());
        Robot closest = allies.get(0);
        float minDist = getPos(closest).dist(ballPos);
        float distToBall;
        for (int i = 1; i < allies.size(); i++) {
            distToBall = getPos(allies.get(i)).dist(ballPos);
            if (distToBall < minDist) {
                closest = allies.get(i);
                minDist = distToBall;
            }
        }
        return closest;
    }

    public static Robot getFoeClosestToBall() {
        ArrayList<Robot> foes = getFoes();
        Vector2d ballPos = getPos(wrapper.getBall());
        Robot closest = foes.get(0);
        float minDist = getPos(closest).dist(ballPos);
        float distToBall;
        for (int i = 1; i < foes.size(); i++) {
            distToBall = getPos(foes.get(i)).dist(ballPos);
            if (distToBall < minDist) {
                closest = foes.get(i);
                minDist = distToBall;
            }
        }
        return closest;
    }

    public static GameState getCurrState() {
        return currState;
    }

    public static GameState getPrevState() {
        return prevState;
    }

    public static Vector2d getBallPlacementLocation() {
        return ballPlacementLocation;
    }

    public static Ball getBall() {
        return wrapper.getBall();
    }

    public static SSL_GeometryFieldSize getField() {
        return wrapper.getField();
    }

    public static void setTeamColor(Team teamColor) {
        GameInfo.TEAM_COLOR = teamColor;
    }

    public static void setFoeTeamColor(Team teamColor) {
        GameInfo.FOE_TEAM_COLOR = teamColor;
    }

    public static void setCurrState(GameState currState) {
        GameInfo.currState = currState;
    }

    public static void setBallPlacementLocation(Vector2d placementLocation) {
        GameInfo.ballPlacementLocation = placementLocation;
    }

}
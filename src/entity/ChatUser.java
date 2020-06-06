package entity;

public class ChatUser {
    // ��� ������������
    private String name;
    // ��������� ����� �������������� � �������� � ���������� �����������,
    // ��������� � 1 ������ 1970 ����
    private long lastInteractionTime;
    // ������������� Java-������ ������������
    private String sessionId;
    //���������� �������������
    private static int Kol = 0;


    public ChatUser(String name,long lastInteractionTime,String sessionId) {
        super();
        this.name = name;
        this.lastInteractionTime = lastInteractionTime;
        this.sessionId = sessionId;
        Kol+=1;
    }

    public static int getKol() {
        return Kol;
    }

    public static void setKol(int kol) {
        Kol -= kol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLastInteractionTime() {
        return lastInteractionTime;
    }

    public void setLastInteractionTime(long lastInteractionTime) {
        this.lastInteractionTime = lastInteractionTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
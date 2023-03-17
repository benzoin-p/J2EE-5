package com.demo.Entity;


public enum State {
    active(0),
    inactive(1),
    close(2);



    private int type;

    State(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }


    public static State intToEnum(int type)
    {
        State[] stateValue = State.values();
        for(State state:stateValue)
        {
            if(state.getType() == type)
            {
                return state;
            }
        }
        return null;
    }

}

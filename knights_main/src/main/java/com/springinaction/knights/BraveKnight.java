package com.springinaction.knights;

/**
 * Created by Fedor on 9/25/2016.
 */
public class BraveKnight implements Knight {

    public BraveKnight() {

    }

    private Quest quest;
    public BraveKnight(Quest quest) {
        this.quest = quest; // Внедрение сценария подвига
    }
    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}

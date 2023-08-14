package GA_package;

import java.util.ArrayList;
import java.util.List;

public class SkillManager {
    private List<Skill> skills;

    public SkillManager() {
        skills = new ArrayList<>();
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public List<Skill> viewAllSkills() {
        return skills;
    }

    public boolean deleteSkill(String skillName) {
        for (Skill skill : skills) {
            if (skill.getName().equalsIgnoreCase(skillName)) {
                skills.remove(skill);
                return true;
            }
        }
        return false;
    }
}

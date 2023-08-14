package GA_package;

import java.util.ArrayList;
import java.util.List;

public class SkillMain {
    public static void main(String[] args) {
        SkillManager skillManager = new SkillManager();

        String[] menu = {
            "1. Add Skill",
            "2. View Skills",
            "3. Delete Skill",
            "4. Quit"
        };

        int option;
        do {
            option = Helper.getUserOption("CPA MENU", menu);

            if (option == 1) {
                String skillName = Helper.readString("Enter skill name: ");
                String skillDescription = Helper.readString("Enter skill description: ");
                skillManager.addSkill(new Skill(skillName, skillDescription));
                System.out.println("Skill added successfully!");
            } else if (option == 2) {
                List<Skill> allSkills = skillManager.viewAllSkills();
                if (allSkills.isEmpty()) {
                    System.out.println("No skills found.");
                } else {
                    System.out.println("Skills:");
                    for (Skill skill : allSkills) {
                        System.out.println(skill.getName() + " - " + skill.getDescription());
                    }
                }//
            } else if (option == 3) {
                String skillToDelete = Helper.readString("Enter skill name to delete: ");
                boolean isDeleted = skillManager.deleteSkill(skillToDelete);
                if (isDeleted) {
                    System.out.println(skillToDelete + " skill has been deleted successfully!");
                } else {
                    System.out.println(skillToDelete + " skill not found!");
                }
            } else if (option == 4) {
                System.out.println("Thank you for using CPA!");
            } else {
                System.out.println("Invalid option. Please select again.");
            }
        } while (option != 4);
    }
}
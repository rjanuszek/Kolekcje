import java.util.Objects;

public class Bug implements Comparable<Bug> {
    private String descriptionBug;
    private BugReporter bugReporter;
    private int bugPriority;
    private boolean bugStatus;

    public Bug(String descriptionBug, BugReporter bugReporter, int bugPriority) {
        this.descriptionBug = descriptionBug;
        this.bugReporter = bugReporter;
        this.bugPriority = bugPriority;
        this.bugStatus = bugStatus;
    }

    public String getDescriptionBug() {
        return descriptionBug;
    }

    public void setDescriptionBug(String descriptionBug) {
        this.descriptionBug = descriptionBug;
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setbugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default: {
                System.out.println("Incorrect bug priority range");
            }
        }
    }

    public boolean isBugStatus() {
        return bugStatus;
    }

//    public void setBugStatus(boolean bugStatus) {
//        notifyStatusChange();
//        this.bugStatus = bugStatus;
//    }

    @Override
    public String toString() {
        return "Bug{" +
                "descriptionBug='" + descriptionBug + '\'' +
                ", email=" + bugReporter +
                ", bugPriority=" + bugPriority +
                ", bugStatus=" + bugStatus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return bugPriority == bug.bugPriority && bugStatus == bug.bugStatus && Objects.equals(descriptionBug, bug.descriptionBug) && Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descriptionBug, bugReporter, bugPriority, bugStatus);
    }

    @Override
    public int compareTo(Bug bug) {
        return this.getDescriptionBug().compareTo(bug.getDescriptionBug());
    }

//    @Override
//    public void notifyStatusChange() {
//        System.out.println("Status buga się zmienił.");
//    }
}

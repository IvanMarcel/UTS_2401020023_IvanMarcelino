// soal no 5
abstract class Assessment {
        abstract double calculateFinalScore();
    }

    // Subclass Exam
    class Exam extends Assessment {
        private double score;

        public Exam(double score) {
            this.score = score;
        }

        @Override
        double calculateFinalScore() {
            return score;
        }
    }

    // Subclass Assignment
    class Assignment extends Assessment {
        private double score;

        public Assignment(double score) {
            this.score = score;
        }

        @Override
        double calculateFinalScore() {
            return score * 0.8; // contoh bobot tugas
        }
    }

    // Interface
    interface Gradable {
        String getGrade();
    }

    class GradeResult implements Gradable {
        private double finalScore;

        public GradeResult(double finalScore) {
            this.finalScore = finalScore;
        }

        @Override
        public String getGrade() {
            if (finalScore >= 85) return "A";
            else if (finalScore >= 70) return "B";
            else if (finalScore >= 55) return "C";
            else return "D";
        }
    }


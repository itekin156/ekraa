package com.example.user.electricschool.Model;

public class Evaluate
{
        private String namesub;
        private  String evaluateteach;

    public Evaluate(String namesub, String evaluateteach )
    {
        this.namesub = namesub;
        this.evaluateteach = evaluateteach;
    }



    public String getNamesub()
    {
        return namesub;
    }

        public void setNamesub(String namesub)
        {
        this.namesub = namesub;
    }

        public String getEvaluateteach()
        {
        return evaluateteach;
    }

        public void setEvaluateteach(String evaluateteach)
        {
        this.evaluateteach = evaluateteach;
    }
}

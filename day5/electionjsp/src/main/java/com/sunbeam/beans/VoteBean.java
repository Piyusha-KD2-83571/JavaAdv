package com.sunbeam.beans;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.daos.UserDao;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.pojos.Candidate;
import com.sunbeam.pojos.User;

public class VoteBean 
{
	private int candidateId;
	private int userId;


	
	public VoteBean() {
		super();
	}




	public VoteBean(int candidateId, int userId) {
		super();
		this.candidateId = candidateId;
		this.userId = userId;
	}
	



	public int getCandidateId() {
		return candidateId;
	}




	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}




	public int getUserId() {
		return userId;
	}




	public void setUserId(int userId) {
		this.userId = userId;
	}




	public void votedCandidate()
	{
		int count =0;
		System.out.println("candidateid  :"+candidateId);
		System.out.println("userid  :"+userId);
			try(CandidateDao candDao = new CandidateDaoImpl())
			{
			   count = candDao.incrementVote(candidateId);
			   System.out.println("candidateid  :"+count);
			   if(count!=0)
			   {
				   try(UserDao userDao = new UserDaoImpl())
					{
						userDao.updateStatus(userId, true); 
						
						
					}  
			   }
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	

}

package com.example.Day26_PracticeAssignment.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.Day26_PracticeAssignment.Dao.ShowDao;
import com.example.Day26_PracticeAssignment.Dao.TicketDao;
import com.example.Day26_PracticeAssignment.model.Show;
import com.example.Day26_PracticeAssignment.model.Ticket;

import jakarta.servlet.http.HttpSession;

//@SessionAttributes("bookingDate")
@RestController
public class JspController {

	@Autowired
	TicketDao td;
	
	@Autowired
	ShowDao sd;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("/")
	public ModelAndView getIndex()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("showticketpage")
	public ModelAndView getshowticketpage()
	{
		ModelAndView mv =new ModelAndView("showticketpage");
		mv.addObject("msg","");
		return mv;
	}
	
	@RequestMapping("checkAvailablity")
	public ModelAndView checkAvailablity(@RequestParam long mobileNumber,String mname,String sdate,String sname,String tType,int nticket)
	{
		ModelAndView mv =new ModelAndView("showticketpage");
		Optional<Show> li=sd.findByMnameAndSdateAndSname(mname, sdate, sname);
		System.out.println(li);
		if(li.isEmpty())
		{
			if(tType.equals("Economic - Rs.150")&&nticket<=300 && nticket>0)
			{
				Show s=new Show(mname,sdate,sname,mobileNumber,tType);
				s.setTotalAvailableEconomicTicket(nticket);
				s.setTotalAvailablePlatinumTicket(0);
				s.setNumberofseats(nticket);
				LocalDateTime date = LocalDateTime.now();
				String bookingDate=String.valueOf(date);
				s.setBookingDate(bookingDate);
				sd.save(s);

				
//				Ticket t=new Ticket(mobileNumber,mname,tType,sdate,sname);
//				t.setNumberofseats(nticket);
//				t.setBookingDate(bookingDate);
//				t.setPaidamount(0);
//				t.setPaymentType("");
//				t.setStatus("");
//				t.setTrasactionId(0);
//				System.out.println(t);
//				td.save(t);
//				ModelMap mm=new ModelMap();
				session.setAttribute("bookingDate", bookingDate);
				mv.addObject("msg","Tickets are availabel...1");
			}
			else if(tType.equals("Platinum - Rs.250")&&nticket<=100 && nticket>0)
			{
				Show s=new Show(mname,sdate,sname,mobileNumber,tType);
				s.setTotalAvailableEconomicTicket(0);
				s.setTotalAvailablePlatinumTicket(nticket);
				s.setNumberofseats(nticket);
				LocalDateTime date = LocalDateTime.now();
				String bookingDate=String.valueOf(date);
				s.setBookingDate(bookingDate);
				sd.save(s);
//				Ticket t=new Ticket(mobileNumber,mname,tType,sdate,sname);
//				t.setNumberofseats(nticket);
//				t.setBookingDate(bookingDate);
//				t.setPaidamount(0);
//				t.setPaymentType("");
//				t.setStatus("");
//				t.setTrasactionId(0);
//				System.out.println(t);
//				td.save(t);
//				ModelMap mm=new ModelMap();
				session.setAttribute("bookingDate", bookingDate);
				mv.addObject("msg","Tickets are availabel...2");
			}
			else
			{
				System.out.println("Error in check availability1");
				mv.addObject("msg","error in check availability1");
			}
			
		}
		else if(li.get()!=null)
		{
			if(tType.equals("Economic - Rs.150")&&li.get().getTotalAvailableEconomicTicket()+nticket<=300 && nticket>0)
			{
				Show s=new Show(li.get().getMname(),li.get().getSdate(),li.get().getSname(),li.get().getMobileNumber(),li.get().gettType());
				s.setTotalAvailableEconomicTicket(li.get().getTotalAvailableEconomicTicket()+nticket);
				s.setTotalAvailablePlatinumTicket(li.get().getTotalAvailablePlatinumTicket());
				LocalDateTime date = LocalDateTime.now();
				s.setNumberofseats(nticket);
				String bookingDate=String.valueOf(date);
				s.setBookingDate(bookingDate);
				sd.save(s);
//				Ticket t=new Ticket(mobileNumber,mname,tType,sdate,sname);
//				t.setNumberofseats(nticket);
//
//				t.setMobileNumber(mobileNumber);
//				t.setMname(mname);
//				t.settType(tType);
//				t.setSdate(sdate);
//				t.setSname(sname);
//				t.setBookingDate(bookingDate);
//				t.setPaidamount(0);
//				t.setPaymentType("");
//				t.setStatus("");
//				t.setTrasactionId(0);
//				System.out.println(t);
//				td.save(t);
//				System.out.println(td.findByBookingDate(bookingDate));
//				ModelMap mm=new ModelMap();
				session.setAttribute("bookingDate", bookingDate);
				mv.addObject("msg","Tickets are availabel...3");
			}
			else if(tType.equals("Platinum - Rs.250")&&li.get().getTotalAvailablePlatinumTicket()+nticket<=100 && nticket>0)
			{
				Show s=new Show(li.get().getMname(),li.get().getSdate(),li.get().getSname(),li.get().getMobileNumber(),li.get().gettType());
				s.setTotalAvailableEconomicTicket(li.get().getTotalAvailableEconomicTicket());
				s.setTotalAvailablePlatinumTicket(li.get().getTotalAvailablePlatinumTicket()+nticket);
				LocalDateTime date = LocalDateTime.now();
				String bookingDate=String.valueOf(date);
				s.setNumberofseats(nticket);
				s.setBookingDate(bookingDate);
				sd.save(s);
//				Ticket t=new Ticket(mobileNumber,mname,tType,sdate,sname);
//				t.setNumberofseats(nticket);
//				t.setBookingDate(bookingDate);
//				t.setPaidamount(0);
//				t.setPaymentType("");
//				t.setStatus("");
//				t.setTrasactionId(0);
//				System.out.println(t);
//				td.save(t);
//				ModelMap mm=new ModelMap();
				session.setAttribute("bookingDate", bookingDate);
				mv.addObject("msg","Tickets are availabel...4");
			}
			else
			{
				System.out.println("Error in check availability2");
				mv.addObject("msg","error in check availability2");
			}

		}
		else
		{
			System.out.println("error in check availability3");
			mv.addObject("msg","error in check availability3");
		}
		
		return mv;
	}

	@RequestMapping("payment")
	public ModelAndView pay(@RequestParam String PaymentType,int TrasactionId)
	{
		ModelAndView mv=new ModelAndView("success");
		String bookingDate=(String) session.getAttribute("bookingDate");
		System.out.println("payment "+bookingDate);
		Optional<Ticket> tdata=td.findByBookingDate(bookingDate);
		Optional<Show> li=sd.findByBookingDate(bookingDate);
		Ticket t =new Ticket();
		if(!tdata.isEmpty())
		{
			t=tdata.get();
			System.out.println(t +"update");
		}
		else
		{
		t.setBookingDate(bookingDate);
		t.setMname(li.get().getMname());
		t.setMobileNumber(li.get().getMobileNumber());
		t.setNumberofseats(li.get().getNumberofseats());
//		System.out.println(li);
		t.setPaymentType(PaymentType);
		t.setTrasactionId(TrasactionId);
		t.setSname(li.get().getSname());
		t.setSdate(li.get().getSdate());
		t.settType(li.get().gettType());
		if(t.gettType().equals("Economic - Rs.150"))
		{
			t.setPaidamount(li.get().getNumberofseats()*150);
		}
		else if(t.gettType().equals("Platinum - Rs.250"))
		{
			t.setPaidamount(li.get().getNumberofseats()*250);
		}
		else
		{
			t.setPaidamount(0);
			System.out.println("error in paid amount...");
			mv.addObject("msg","error in paid amount...");
		}
		t.setStatus("Confirmed");
		System.out.println(t);
		td.save(t);
		}
		System.out.println("ticket book successfully...");
		mv.addObject("msg","ticket book successfully...");
		mv.addObject("paidAmount",t.getPaidamount());
		mv.addObject("mname",t.getMname());
		mv.addObject("sdate",t.getSdate());
		mv.addObject("sname",t.getSname());
		mv.addObject("tickets",t.getNumberofseats());
		mv.addObject("tid",t.getTicketID());
		mv.addObject("pay",t.getPaymentType());
		mv.addObject("ttype",t.gettType());
		mv.addObject("BookedEconomicTicket",li.get().getTotalAvailableEconomicTicket());
		mv.addObject("BookedPlatinumTicket",li.get().getTotalAvailablePlatinumTicket());
		return mv;
	}

}


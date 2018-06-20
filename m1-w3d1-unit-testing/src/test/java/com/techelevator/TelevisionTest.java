package com.techelevator;
//done
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TelevisionTest {
	private Television tv;
	@Before
	public void setup(){
		tv = new Television();
	}
	
	
	@Test
	public void tv_initialized_correctly(){
		
		//Assert
		Assert.assertFalse("The television should be turned off when new.", tv.isOn());
		Assert.assertEquals("default channel is 3", 3, tv.getSelectedChannel());
		Assert.assertEquals("default volume is 0", 0, tv.getCurrentVolume());

	}
	
	@Test
	public void turn_on_tv(){
		tv.TurnOn();
		Assert.assertTrue("tv should be on", tv.isOn());

	}
	@Test
	public void turn_off_tv_while_off(){	
		tv.TurnOff();
		Assert.assertFalse("tv should be off", tv.isOn());
	}
	@Test
	public void channel_change_with_tv_on(){
		tv.TurnOn();
		tv.ChangeChannel(4);
		Assert.assertEquals("the channel should change", 4, tv.getSelectedChannel());
		
	}
	
	@Test
	public void channel_to_high_on(){
		tv.TurnOn();
		tv.ChangeChannel(19);
		Assert.assertEquals("the channel shouldnt change", 3, tv.getSelectedChannel());

	}
	@Test
	public void channel_to_high_off(){
		tv.ChangeChannel(19);
		Assert.assertEquals("the channel shouldnt change", 3, tv.getSelectedChannel());

	}
	
	@Test
	public void channel_to_low_on(){
		tv.TurnOn();
		tv.ChangeChannel(2);
		Assert.assertEquals("the channel shouldnt change", 3, tv.getSelectedChannel());

	}
	@Test
	public void channel_to_low_off(){
		tv.ChangeChannel(2);
		Assert.assertEquals("the channel shouldnt change", 3, tv.getSelectedChannel());

	}
	@Test
	public void channel_change_with_tv_off(){
		tv.ChangeChannel(4);
		Assert.assertEquals("the channel shouldnt change", 3, tv.getSelectedChannel());

	}
	
	@Test
	public void channel_does_not_change(){
		tv.TurnOn();
		tv.ChangeChannel(19);
		Assert.assertEquals("the channel shouldnt change", 3, tv.getSelectedChannel());

	}
	@Test
	public void raise_volume_with_tv_on(){
		tv.TurnOn();
		for(int i = 0; i < 5; i++){
			tv.RaiseVolume();
		}
		
		Assert.assertEquals("should be volumbe 5", 5, tv.getCurrentVolume());
	}
	@Test
	public void raise_volume_with_tv_off(){
		for(int i = 0; i < 5; i++){
			tv.RaiseVolume();
		}
		
		Assert.assertEquals("should be volumbe 0", 0, tv.getCurrentVolume());
	}
	@Test
	public void raise_volume_to_11(){
		tv.TurnOn();
		for(int i = 0; i < 11; i++){
			tv.RaiseVolume();
		}
		Assert.assertEquals("expected 10", 10, tv.getCurrentVolume());
	}
	@Test
	public void lower_volume_with_tv_1_to_0_tv_off(){
		tv.RaiseVolume();
		tv.LowerVolume();
		
		
		Assert.assertEquals("Volume should not change with tv off", 0, tv.getCurrentVolume());
	}
	
	@Test
	public void lower_volume_to_1_to_0_tv_on(){
		tv.TurnOn();
		tv.RaiseVolume();
		tv.LowerVolume();
		Assert.assertEquals("expected 0", 0, tv.getCurrentVolume());
	}
	@Test
	public void lower_volume_to_negative_tv_on(){
		tv.TurnOn();
		tv.LowerVolume();
		Assert.assertEquals("expected 1", 0, tv.getCurrentVolume());
	}
	@Test
	public void lower_volume_to_negative_tv_off(){
	
		tv.LowerVolume();
		tv.LowerVolume();
		tv.LowerVolume();
		Assert.assertEquals( 0, tv.getCurrentVolume());
	}
	
	
	
}

package by.khmara.epam.mod4.task6;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;

	private static final int HOURS_IN_DAY = 24;
	private static final int MINUTES_IN_HOUR = 60;
	private static final int SECONDS_IN_MINUTE = 60;

	public Time(int hours, int minutes, int seconds) {
		if (hours >= 0 && hours < HOURS_IN_DAY) {
			this.hours = hours;
		} else {
			this.hours = 0;
		}

		if (minutes >= 0 && minutes < MINUTES_IN_HOUR) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}

		if (seconds >= 0 && seconds < SECONDS_IN_MINUTE) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
	}

	public void changeHours(int hours) {
		if (this.hours + hours < HOURS_IN_DAY && this.hours + hours >= 0) {
			this.hours = this.hours + hours;
		} else if (this.hours + hours >= HOURS_IN_DAY && hours >= 0) {
			this.hours = (this.hours + hours) % HOURS_IN_DAY;
		} else if (this.hours + hours > -HOURS_IN_DAY) {
			this.hours = HOURS_IN_DAY + this.hours + hours;
		} else if (this.hours + hours <= -HOURS_IN_DAY) {
			this.hours = HOURS_IN_DAY + (this.hours + hours) % HOURS_IN_DAY;
		}

	}

	public void changeMinutes(int minutes) {
		if (this.minutes + minutes < MINUTES_IN_HOUR && this.minutes + minutes >= 0) {
			this.minutes = this.minutes + minutes;
		} else if (this.minutes + minutes >= MINUTES_IN_HOUR && minutes >= 0) {
			changeHours((this.minutes + minutes) / MINUTES_IN_HOUR);
			this.minutes = (this.minutes + minutes) % MINUTES_IN_HOUR;
		} else if (this.minutes + minutes >= -MINUTES_IN_HOUR) {
			this.minutes = MINUTES_IN_HOUR + this.minutes + minutes;
			changeHours(-1);
		} else if (this.minutes + minutes < -MINUTES_IN_HOUR) {
			changeHours((this.minutes + minutes) / MINUTES_IN_HOUR);
			this.minutes = MINUTES_IN_HOUR + (this.minutes + minutes) % MINUTES_IN_HOUR;
		}
	}

	public void changeSeconds(int seconds) {
		if (this.seconds + seconds < SECONDS_IN_MINUTE && this.seconds + seconds >= 0) {
			this.seconds = this.seconds + seconds;
		} else if (this.seconds + seconds >= SECONDS_IN_MINUTE && seconds >= 0) {
			changeMinutes((this.seconds + seconds) / SECONDS_IN_MINUTE);
			this.seconds = (this.seconds + seconds) % SECONDS_IN_MINUTE;
		} else if (this.seconds + seconds >= -SECONDS_IN_MINUTE) {
			this.seconds = 60 + this.seconds + seconds;
			changeMinutes(-1);
		} else if (this.seconds + seconds < -SECONDS_IN_MINUTE) {
			changeMinutes((this.seconds + seconds) / SECONDS_IN_MINUTE);
			this.seconds = SECONDS_IN_MINUTE + (this.seconds + seconds) % SECONDS_IN_MINUTE;
		}
	}

	public void changeTime(int hours, int minutes, int seconds) {
		changeHours(hours);
		changeMinutes(minutes);
		changeSeconds(seconds);
	}

	public void setHours(int hours) {
		if (hours >= 0 && hours < 24) {
			this.hours = hours;
		} else {
			this.hours = 0;
		}
	}

	public void setMinutes(int minutes) {
		if (minutes >= 0 && minutes < 60) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
	}

	public void setSeconds(int seconds) {
		if (seconds >= 0 && seconds < 60) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

}

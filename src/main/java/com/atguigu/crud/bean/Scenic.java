package com.atguigu.crud.bean;

public class Scenic {
    private Integer scenicId;

    private Integer worldId;

    private Integer regionId;

    private Integer addressId;

    private String address;

    private Integer themeId;

    private Boolean isCheap;

    private Boolean isRecommend;

    private Integer searchNum;

    private Integer olderId;

    private Integer childId;

    private Integer adultId;

    private Integer score;

    private String level;

    private String typeOne;

    private String typeTwo;

    private String typeThree;

    private String scenicName;

    private String longitude;

    private String latitude;

    private String location;

    private String wheelImgOne;

    private String wheelImgTwo;

    private String wheelImgThree;

    private String wheelImgFour;

    private String wheelImgFive;

    private String scenicpresentOne;

    private String photoOne;

    private String scenicpresentTwo;

    private String photoTwo;

    private String photoThree;

    private String photoFour;
    
    private Adultticket adultticket;
    
    private World world;
    
    private Region region;
    
    private Address address1;
    
    private Theme theme;
    
   private Olderticket olderticket ;
   
   private Childticket childticket;

	public Olderticket getOlderticket() {
	return olderticket;
}

public void setOlderticket(Olderticket olderticket) {
	this.olderticket = olderticket;
}

public Childticket getChildticket() {
	return childticket;
}

public void setChildticket(Childticket childticket) {
	this.childticket = childticket;
}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public Adultticket getAdultticket() {
		return adultticket;
	}

	public void setAdultticket(Adultticket adultticket) {
		this.adultticket = adultticket;
	}

	public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public Integer getWorldId() {
        return worldId;
    }

    public void setWorldId(Integer worldId) {
        this.worldId = worldId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public Boolean getIsCheap() {
        return isCheap;
    }

    public void setIsCheap(Boolean isCheap) {
        this.isCheap = isCheap;
    }

    public Boolean getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getSearchNum() {
        return searchNum;
    }

    public void setSearchNum(Integer searchNum) {
        this.searchNum = searchNum;
    }

    public Integer getOlderId() {
        return olderId;
    }

    public void setOlderId(Integer olderId) {
        this.olderId = olderId;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public Integer getAdultId() {
        return adultId;
    }

    public void setAdultId(Integer adultId) {
        this.adultId = adultId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getTypeOne() {
        return typeOne;
    }

    public void setTypeOne(String typeOne) {
        this.typeOne = typeOne == null ? null : typeOne.trim();
    }

    public String getTypeTwo() {
        return typeTwo;
    }

    public void setTypeTwo(String typeTwo) {
        this.typeTwo = typeTwo == null ? null : typeTwo.trim();
    }

    public String getTypeThree() {
        return typeThree;
    }

    public void setTypeThree(String typeThree) {
        this.typeThree = typeThree == null ? null : typeThree.trim();
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getWheelImgOne() {
        return wheelImgOne;
    }

    public void setWheelImgOne(String wheelImgOne) {
        this.wheelImgOne = wheelImgOne == null ? null : wheelImgOne.trim();
    }

    public String getWheelImgTwo() {
        return wheelImgTwo;
    }

    public void setWheelImgTwo(String wheelImgTwo) {
        this.wheelImgTwo = wheelImgTwo == null ? null : wheelImgTwo.trim();
    }

    public String getWheelImgThree() {
        return wheelImgThree;
    }

    public void setWheelImgThree(String wheelImgThree) {
        this.wheelImgThree = wheelImgThree == null ? null : wheelImgThree.trim();
    }

    public String getWheelImgFour() {
        return wheelImgFour;
    }

    public void setWheelImgFour(String wheelImgFour) {
        this.wheelImgFour = wheelImgFour == null ? null : wheelImgFour.trim();
    }

    public String getWheelImgFive() {
        return wheelImgFive;
    }

    public void setWheelImgFive(String wheelImgFive) {
        this.wheelImgFive = wheelImgFive == null ? null : wheelImgFive.trim();
    }

    public String getScenicpresentOne() {
        return scenicpresentOne;
    }

    public void setScenicpresentOne(String scenicpresentOne) {
        this.scenicpresentOne = scenicpresentOne == null ? null : scenicpresentOne.trim();
    }

    public String getPhotoOne() {
        return photoOne;
    }

    public void setPhotoOne(String photoOne) {
        this.photoOne = photoOne == null ? null : photoOne.trim();
    }

    public String getScenicpresentTwo() {
        return scenicpresentTwo;
    }

    public void setScenicpresentTwo(String scenicpresentTwo) {
        this.scenicpresentTwo = scenicpresentTwo == null ? null : scenicpresentTwo.trim();
    }

    public String getPhotoTwo() {
        return photoTwo;
    }

    public void setPhotoTwo(String photoTwo) {
        this.photoTwo = photoTwo == null ? null : photoTwo.trim();
    }

    public String getPhotoThree() {
        return photoThree;
    }

    public void setPhotoThree(String photoThree) {
        this.photoThree = photoThree == null ? null : photoThree.trim();
    }

    public String getPhotoFour() {
        return photoFour;
    }

    public void setPhotoFour(String photoFour) {
        this.photoFour = photoFour == null ? null : photoFour.trim();
    }
}
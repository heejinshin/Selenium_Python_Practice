from selenium import webdriver 
import time
from selenium.webdriver.common.keys import Keys

#브라우저 생성
browser = webdriver.Chrome('/Users/shinheejin/Desktop/chromedriver') 

#브라우저 열기
browser.get('https://naver.com') 
browser.implicitly_wait(10)

#쇼핑메뉴 클릭
browser.find_element_by_css_selector('a.nav.shop').click()
time.sleep(2)

#검색창 클릭
search = browser.find_element_by_css_selector('input._searchInput_search_input_QXUFf')
search.click() 

#검색어 입력
search.send_keys('아이폰 13')
# search.send_keys('enter')
search.send_keys(Keys.ENTER)

#스크롤 전 높이
before_h = browser.execute_script("return window.scrollY")


#무한스크롤 > 반복문, 무한반복문 
while True: 
    # 맨 아래로 스크롤을 내린다. 
    browser.find_element_by_css_selector("body").send_keys(Keys.END)
    
    # 스크롤 사이 페이지 로딩 시간 
    time.sleep(1) 
    
    # 스크롤 후 높이 
    after_h = browser.execute_script("return window.scrollY")
    
    if after_h == before_h:
        break   #탈출 
    before_h = after_h
    
# 상품 정보 div  
items = browser.find_element_by_css_selector(".basicList_info_area__17Xyo")

for item in items:
    name = item.find_element_by_css_selector(".basicList_title__3P9Q7").text 
    try:
        price = item.find_find_element_by_css_selector(".price_num__2WUXn").text 
    except:
        price = "판매중단"
    link = item.find_element_by_css_selector(".price_num__2WUXn > a").get_attribute('href')  
    print(name, price, link)
    